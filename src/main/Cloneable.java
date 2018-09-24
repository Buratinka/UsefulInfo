package main;


import java.io.*;

public class Cloneable
{

    static class Person implements Serializable {
        int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;

        public Person(int age , String name )
        {
            this.age = age;
            this.name = name;
        }

        public Person(Person other)
        {
            this(other.getAge(),other.getName());
        }
        @Override
        public String toString()
        {
            return "Person("+"age "+age+", name '"+name+'\''+'}';
        }
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /**
         *
         * clone with copy Constructor
         *
         * */
//        Person original = new Person(23,"Oleg");
//        Person clone = new Person(original);
//
//        System.out.println(original);
//        System.out.println(clone);


        /**
         *
         * clone with serialzation
         *
         * */
//        Person person = new Person(23,"Oleg");
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream ous = new ObjectOutputStream(baos);
//        ous.writeObject(person);
//        ous.close();
//
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bais);
//
//        Person clonePerson = (Person) ois.readObject();
//
//        System.out.println(person);
//        System.out.println(clonePerson);



    }
}

