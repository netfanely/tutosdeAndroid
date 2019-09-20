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
  }
}
