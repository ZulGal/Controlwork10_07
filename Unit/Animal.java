package Unit;

public abstract class Animal implements RegistryInterface {
        protected int id;
        protected String typeAnimal;
        protected String classAnimal;
        protected String name;
        protected String commands;
        protected String birthday;

    public Animal(int id, String typeAnimal, String classAnimal, String name, String commands, String birthday) {
        this.id = id;
        this.typeAnimal = typeAnimal;
        this.classAnimal = classAnimal;
        this.name = name;
        this.commands = commands;
        this.birthday = birthday;
    }
    public Animal() {
    }
    @Override
    public String getInfo() {return String.format("%3d %8s %8s %8s %8s %8s",id, typeAnimal,classAnimal,name,commands,birthday);}

    public void setId(int id) {
        this.id = id;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public void setClassAnimal(String classAnimal) {
        this.classAnimal = classAnimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
