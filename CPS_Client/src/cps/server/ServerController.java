package cps.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;

import cps.clientServer.ClientServerConsts;
import cps.utilities.CPS_Tracer;

// TODO: Auto-generated Javadoc
/**
 * The Class ServerController. The entry point for the server. Listen for sockets. 
 */
public class ServerController
{
    private void ListenAndResponse() throws IOException
    {
	try (ServerSocket serverSocket = new ServerSocket(ClientServerConsts.PORT))
	{
	    CPS_Tracer.TraceInformation("Server has started to listen on IP "
		    + InetAddress.getLocalHost().getHostAddress() + " Port " + ClientServerConsts.PORT);
	    
	    while (true)
	    {
		try
		{
		    Socket socket = serverSocket.accept();
		    
		    ServerRequestHandler.HandleRequestAsync(socket);
		}
		catch (Exception e)
		{
		    CPS_Tracer.TraceError(e.toString());
		    // Socked will be closed and the client will get
		    // ServerResponse with Failed result
		}
	    }
	}
	catch (Exception e)
	{
	    CPS_Tracer.TraceError(e.toString());
	}
	
	CPS_Tracer.TraceInformation("Server is shutting down.");
    }
    
    private void RegisterTimers() throws InterruptedException
    {
	// Timer timer = new Timer();
	
	TimerTask updateReservations = new TimerTask()
	{
	    @Override
	    public void run()
	    {
		try (ServerRequestHandler serverRequestHandler = new ServerRequestHandler())
		{
		    serverRequestHandler.UpdateReservationsStatus();
		}
		catch (Exception e)
		{
		    System.out.println(e);
		}
	    }
	};
	
	new Timer().schedule(updateReservations, 0, 1000 * 60 * 60);
	
	Thread.sleep(500);
	
	TimerTask membershipsReminder = new TimerTask()
	{
	    @Override
	    public void run()
	    {
		try (ServerRequestHandler serverRequestHandler = new ServerRequestHandler())
		{
		    serverRequestHandler.EmailMemberships();
		}
		catch (Exception e)
		{
		    System.out.println(e);
		}
	    }
	};
	
	new Timer().schedule(membershipsReminder, 0, 1000 * 60 * 60 * 24);
	
    }
    
    /**
     * The server's entry point. Wait for connections and setup timers.
     *
     * @param args
     *            the arguments
     * @throws Exception
     *             the exception
     */
    public static void main(String[] args) throws Exception
    {
	ServerController serverController = new ServerController();
	
	serverController.RegisterTimers();
	
	serverController.ListenAndResponse();
    }
}