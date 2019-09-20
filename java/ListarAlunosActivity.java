/*listar alunos*/
package com.netfanely.exemplocrud;

/*import*/

public class ListarAlunosActivity extends AppCompatActivity {

  private ListView listView;
  private AlunoDAO dao;
  private List<Aluno> alunos;
  private List<Aluno> alunosFiltrados = new ArrayList<>();
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_listar_alunos);
    
      listView = findViewById(R.id.lista_alunos);
      dao = new AlunoDAO(this);
      alunos = dao.obterTodos();
      alunosFiltrados.addAll(alunos);
      ArrayAdapter<Aluno> adaptador = new ArrayAdapter<Aluno>(this,android.R.layout.simple_list_item_1,alunos);
      listView.setAdapter(adaptador);
  }
  
  public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu_principal, menu);
        return true;
  }
  public void cadastrar(MenuItem item){
    
  }
}
