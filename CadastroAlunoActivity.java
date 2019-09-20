private EditText nome;
private EditText cpf;
private EditText telefone;
private AlunoDAO dao;

@Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_cadastro_aluno);
  
  nome=findViewById(R.id.editNome);
  cpf=findViewById(R.id.editCPF);
  telefone=findViewById(R.id.editTelefone);
  dao=new AlunoDAO(this);
  
  }
