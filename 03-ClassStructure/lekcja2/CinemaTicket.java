public class CinemaTicket {
    static String cinemaName = "MultiPlex";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    //methods
    public CinemaTicket(String filmTitle, int row, int seat){
        if(row<3){
            this.price=10.00;
        }else{
            this.price=25.00;
        }
        this.filmTitle=filmTitle;
        this.row=row;
        this.seat=seat;
    }
    
    public void displayTicket() {
        System.out.println("TICKET INFO");
        System.out.println("Cinema name: " +cinemaName);
        System.out.println("Film title: " +filmTitle);
        System.out.println("Row: " +row);
        System.out.println("Seat: "+seat);
        System.out.println("Price: "+price+ " zł");
    }
    
    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("Człowiek ze stali", 5, 7);
        CinemaTicket ticket2 = new CinemaTicket("Rzymskie wakacje", 2, 6);
        
        //ticket1.filmTitle = "Człowiek ze stali";
        //ticket1.row = 5;
        //ticket1.seat = 7;
        //ticket1.price = 20.50;
        
        //ticket2.filmTitle = "Rzymskie wakacje";
        //ticket2.row = 2;
        //ticket2.seat = 6;
        //ticket2.price = 15.90;
        
        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}