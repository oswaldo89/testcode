public class AgendaView extends Fragment implements Interface.View {

    RecyclerView recycler_agenda;
    ListView zones_list;
    AgendaPresenter agendaPresenter;
    FragmentActivity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.agenda_fragment, container, false);
        this.agendaPresenter = new AgendaPresenter(this);
        this.context = getActivity();

        initTable(v);
        

        return v;
    }

    private void initTable(View v) {
        LinearLayoutManager llm = new LinearLayoutManager(context);
        recycler_agenda = v.findViewById(R.id.table_agenda);
        recycler_agenda.setHasFixedSize(true);
        recycler_agenda.setLayoutManager(llm);
        agendaPresenter.getReservations();
    }

    @Override
    public void getReservations(ArrayList<Reservation> reservation) {
        AdapterAgendaList adapter = new AdapterAgendaList(reservation);
        recycler_agenda.setAdapter(adapter);
    }

    
}