public class EstacionTren
{
    private String ciudad;
    private TicketMachine maquina1;
    private TicketMachine maquina2;
    
    /**
     * Constructor de la estaci�n de tren
     */
    public EstacionTren (String nombreCiudad,int precioMaquina1, int precioMaquina2)
    {
        ciudad = nombreCiudad;
        maquina1 = new TicketMachine(precioMaquina1);
        maquina2 = new TicketMachine(precioMaquina2);
    }
    
    /**
     * Simula la venta de un billete en la m�quina
     */   
    public void ventaBilleteMaquina1()
    {
        maquina1.insertMoney(500);
        maquina1.printTicket();
    }
    
    /**
     * Simula la venta de un billete en la m�quina
     */   
    public void ventaBilleteMaquina2()
    {
        maquina2.insertMoney(600);
        maquina2.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado por las m�quinas de la estaci�n hasta el momento
     */
    public int dineroRecaudadoHastaElMomento()
    {
        return maquina1.getTotal() + maquina2.getTotal();
    }
    
    /**
     * Devuelve el total de dinero recaudado por la m�quina 1
     */
    public int dineroRecaudadoMaquina1()
    {
        return maquina1.getTotal();
    }
    
    /**
     * Devuelve el total de dinero recaudado por la m�quina 1
     */
    public int dineroRecaudadoMaquina2()
    {
        return maquina2.getTotal();
    }
    
    /**
     * IDjasjdnsajd
     */
    public void mostrarRecaudacionTotalMaquinas()
    {
        System.out.println("Recaudaci�n maquina 1" + maquina1.getTotal());
        System.out.println("Recaudaci�n maquina 2" + maquina2.getTotal());
        System.out.println("Recaudaci�n total" + (maquina1.getTotal() + maquina2.getTotal()));
        
    }
}
    
