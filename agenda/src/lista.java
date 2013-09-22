import java.util.LinkedList;

public class lista {

			public LinkedList<String> list  = new LinkedList<String>();
			
			public LinkedList<String> getLinkedList(String listContatos){	
			list.add(listContatos);
			return list;
		}

	}