public interface Interface {

    interface View{
        void getReservations(ArrayList<Reservation> reservations);
    }

    interface Presenter{
        void getReservations();
        void setReservations(ArrayList<Reservation> reservations);
    }

    interface Model{
        void getReservations();
    }
}