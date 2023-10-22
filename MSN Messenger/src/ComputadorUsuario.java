import APPS.FacebookMesseger;
import APPS.MSNMessenger;
import APPS.ServicoMensagemInstantanea;
import APPS.Telegram;

public class ComputadorUsuario {

	public static void main(String[] args) {
		ServicoMensagemInstantanea app = null;
		
		String appEscolhido = "fbc";
		
		if(appEscolhido.equals("msn"))
			app = new MSNMessenger();
		else if(appEscolhido.equals("fbc"))
			app = new FacebookMesseger();
		else if(appEscolhido.equals("tlg"))
			app = new Telegram();
		
		app.enviarMensagem();
		app.receberMensagem();
	}
}
