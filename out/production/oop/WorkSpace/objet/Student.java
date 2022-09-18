package out.production.oop.WorkSpace.objet;

//dans ce code la je vais explique comment utiliser les object

public class Student {

  //les attribues de class Student
  public int Id;
  public String name;

  //voila comment faire un constrectur
  public Student(int Id, String name) {
    this.Id = Id;
    this.name = name;
  }

  // on genere les setter et getter
  //setter d'abord
  public void setId(int Id) {
    this.Id = Id;
  }

  public void setName(String name) {
    this.name = name;
  }

  //getter

  public int getId() {
    return this.Id;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    /*   (Student student1 ) la declaration d'objet 
   le mot cle (new) c'est un operateur de java qui cree l'objet ,
  suivi par l'appel de constructeur pour
  initialise notre objet avec les valeur (1,"student")
   */
    Student student1 = new Student(1, "student");

    //pour modifier les valeur de student1 on utilis les setters de class Student

    student1.setId(2);
    student1.setName("user2");

    //affichage
    System.out.println(student1.getId());
    System.out.println(student1.getName());
  }
}
