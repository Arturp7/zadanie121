public class MainPerson {
    public static void main(String[] args) {
       try {
           Person person1 = new Person("AB", "Bc", 0, "123345");
       } catch (NameUndefinedException e){
           System.out.println(e.getMessage());
       } catch (IncorrectAgeException b){
           System.out.println(b.getMessage());
       } catch (Exception e) {
           e.printStackTrace();
       }


    }

}
