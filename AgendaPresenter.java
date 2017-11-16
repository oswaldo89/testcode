public class AgendaPresenter implements Interface.Presenter {
    private Interface.View view;
    private Interface.Model model;

    AgendaPresenter(Interface.View view) {
        this.view = view;
        this.model = new AgendaModel(this);
    }

    @Override
    public void getReservations() {
        if (view != null) {
            model.getReservations();
        }
    }

    @Override
    public void setReservations(ArrayList<Reservation> reservations) {
        if (view != null) {
            view.getReservations(reservations);
        }
    }

}