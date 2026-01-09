package serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Dog implements Externalizable {
	
	String name;
	
	public Dog() {
		
	}
	
	@Override
	public String toString() {
		
		return name;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeUTF(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = in.readUTF();
	}

}
