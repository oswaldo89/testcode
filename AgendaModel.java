public class AgendaModel implements Interface.Model {
    private Interface.Presenter presenter;

    AgendaModel(Interface.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void getReservations() {
        ArrayList<Reservation> reservations = new ArrayList<>();
        Reservation res;

        res = new Reservation();
        res.setStatus(0);
        res.description = "Oswaldo Daniel Gomez";
        reservations.add(res);

        presenter.setReservations(reservations);
    }

}