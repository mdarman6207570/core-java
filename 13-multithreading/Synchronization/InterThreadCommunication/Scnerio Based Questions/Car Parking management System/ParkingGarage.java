package blc;

public class ParkingGarage
{
     private int availableSpots;
     private final int MAX_SPOTS ;

     
     public ParkingGarage(int maxSpot)
     {
         this.availableSpots = maxSpot;
         this.MAX_SPOTS = maxSpot;
     }
     
     public synchronized void parkCar(String carName)
     {
         while(availableSpots ==0)
         {
             System.out.println(carName+" is waiting for Spot");
             try
             {
                 wait();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
                 Thread.currentThread().interrupt();
                 
             }
             
         }
         availableSpots--;
         System.out.println(carName+" parked. Available spots:"+this.availableSpots);
         notifyAll();
   
     }
     
     
     public synchronized void freeSpot(String carName)
     {
       
         while(availableSpots == MAX_SPOTS)
         {
             try
             {
                 wait();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
                 Thread.currentThread().interrupt();
             }
         }
             availableSpots++;
             
             System.out.println(carName+" left. Available spots:" +this.availableSpots);
              notifyAll();
         
         
     }

     public int getAvailableSpots() {
         return availableSpots;
     }

     public void setAvailableSpots(int availableSpots) {
         this.availableSpots = availableSpots;
     }
     
     
     
}