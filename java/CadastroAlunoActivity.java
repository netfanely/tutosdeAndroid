/* Cadastro Aluno Activity */
package com.netfanely.exemplocrud;

/*import*/

public class CadastroAlunoActivity extends AppCompatActivity{
  
    private EditText nome;
    private EditText cpf;
    private EditText telefone;
  
    @Override
    protected void onCreate(Bundle savedInstanceState){
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_cadastro_aluno);
        
          nome = findViewById(R.id.editNome);
          cpf = findViewById(R.id.editCPF);
          telefone = findViewById(R.id.editTelefone);
    }
    public void salvar(View view){
          Aluno a = new Aluno();
          a.setNome(nome.getText().toString());
          a.setCpf(cpf.getText().toString());
          a.setTelefone(telefone.getText().toString());
    }
}
