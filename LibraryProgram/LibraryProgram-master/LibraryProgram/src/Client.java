
public class Client {
	public String name;
	public int id;
	
	Client(){
	}
	Client(String name, int studentid){
		this.name=name;
		this.id=studentid;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setStudnetid(int studentid) {
		this.id=studentid;
	}
	public int getStudentid() {
		return id;
	}
	
}
