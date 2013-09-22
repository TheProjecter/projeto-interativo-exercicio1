import java.util.LinkedList;
import java.util.ListIterator;


public class agenda {

	private static String nome;
	private static String sobrenome;
	private static String telefoneFixo;
	private static String telefoneMovel;
	private static String [] verNome = new String [50];
	private static String [] verSobrenome = new String [50];
	private static String [] verTelefoneFixo = new String [50];
	private static String [] verTelefoneMovel = new String [50];
	static int i = 0;
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		agenda.nome = nome;
	}
	public static String getSobrenome() {
		return sobrenome;
	}
	public static void setSobrenome(String sobrenome) {
		agenda.sobrenome = sobrenome;
	}
	public static String getTelefoneFixo() {
		return telefoneFixo;
	}
	public static void setTelefoneFixo(String telefoneFixo) {
		agenda.telefoneFixo = telefoneFixo;
	}
	public static String getTelefoneMovel() {
		return telefoneMovel;
	}
	public static void setTelefoneMovel(String telefoneMovel) {
		agenda.telefoneMovel = telefoneMovel;
	}
		
	public static String[] getVerNome() {
		return verNome;
	}
	public static void setVerNome(String[] verNome) {
		agenda.verNome = verNome;
	}
	public static String[] getVerSobrenome() {
		return verSobrenome;
	}
	public static void setVerSobrenome(String[] verSobrenome) {
		agenda.verSobrenome = verSobrenome;
	}
	public static String[] getVerTelefoneFixo() {
		return verTelefoneFixo;
	}
	public static void setVerTelefoneFixo(String[] verTelefoneFixo) {
		agenda.verTelefoneFixo = verTelefoneFixo;
	}
	public static String[] getVerTelefoneMovel() {
		return verTelefoneMovel;
	}
	public static void setVerTelefoneMovel(String[] verTelefoneMovel) {
		agenda.verTelefoneMovel = verTelefoneMovel;
	}
	public static LinkedList<String> addContato (){
		lista contatos = new lista();
		setNome(interfaceAgenda.textField_nome.getText());
		setSobrenome(interfaceAgenda.textField_sobrenome.getText());
		setTelefoneFixo(interfaceAgenda.textField_telefoneFixo.getText());
		setTelefoneMovel(interfaceAgenda.textField_telefoneMovel.getText());
		contatos.getLinkedList(getNome());
		contatos.getLinkedList(getSobrenome());
		contatos.getLinkedList(getTelefoneFixo());
		contatos.getLinkedList(getTelefoneMovel());
		i++;
		getVerNome()[i] = getNome();	
		getVerSobrenome()[i] = getSobrenome();	
		getVerTelefoneFixo()[i] = getTelefoneFixo();
		getVerTelefoneMovel()[i] = getTelefoneMovel();	
		return contatos.list;
	}
	
		
}
