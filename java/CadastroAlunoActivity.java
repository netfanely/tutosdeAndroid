/* Cadastro Aluno Activity */
package com.netfanely.exemplocrud;

/*import*/

public class CadastroAlunoActivity extends AppCompatActivity{
  
    private EditText nome;
    private EditText cpf;
    private EditText telefone;
    private AlunoDAO dao;
  
    @Override
    protected void onCreate(Bundle savedInstanceState){
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_cadastro_aluno);
        
          nome = findViewById(R.id.editNome);
          cpf = findViewById(R.id.editCPF);
          telefone = findViewById(R.id.editTelefone);
          dao = new AlunoDAO(this);
    }
    public void salvar(View view){
          Aluno a = new Aluno();
          a.setNome(nome.getText().toString());
          a.setCpf(cpf.getText().toString());
          a.setTelefone(telefone.getText().toString());
          long id = dao.inserir(a);
          Toast.makeText(this,"Aluno inserido com id: " + id,Toast.LENGTH_SHORT).show();
    }
}
