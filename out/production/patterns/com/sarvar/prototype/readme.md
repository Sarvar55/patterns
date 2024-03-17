# What is Prototype pattern?

The Prototype pattern is creational desing pattern and delegates the object duplicates or cloning process to the actual
objects that are being cloned.

The Prototype pattern is a desing pattern used in software development to create new objects by copying an existing
object, known as the prototype.

Instead of creating new objects from scratch(baştan) the Prototype pattern allows us to clone existing objects and
modify them as needed.

- **Reducing object creation overhead**: Sometime, creating an object from scratch can be expensive in terms of time and
  resources. By using the Prototype pattern , we can avoid this overhead by cloning an existing object.
- **Customizing object creation**: The Prototype pattern allows us to create new objects that are similar to existing
  ones(olanlar)
  but with slight(hafif,biraz) differences. This can be useful when we need to create multiple objects with similar
  properties but some variations.
- **Maintaining object consistency**: If an application requires a consistent(tutarlı) state for objects,the Ptototype
  pattern ensures that all new objects created from a prototype have the same initial state.
- **Hiding the complexity of object creation**: By providing a simple interface for cloning objects,the Prototype
  pattern abstracts away(uzak) the complexitities of objects creation , making the code cleaner
- and easier to understand.

## Real-Life Example: Creating Resumes

Imagine you're a career advisor helping job seekers crate resumes. You have a standard resume template, but each job
seeker whants their resume tailored(özel olarak)
to specific job apps. Istead of creating each resume from scratch , you'll use the ProtoType pattern to clone the
standard resume template and customize it for each job seeker.

### Explanation and code Implementation:

````java
public class Resume implements Cloneable {
    private String name;
    private String email;
    private String experience;

    public Resume(String name, String email, String experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }

}

public class Main {
    public static void main(String[] args) {
        // Create a prototype resume
        Resume prototypeResume = new Resume("John Doe", "john@example.com", "5 years of experience");
        try {
            // Clone the prototype to create a new resume
            Resume customResume = prototypeResume.clone();
            customResume.setName("Alice Smith");
            customResume.setEmail("alice@example.com");
            customResume.setExperience("3 years of experience in software development");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
````

### What is difference between shallow and deep copy?

Shallow copy duplicates only the references to objects, while deep copy duplicates both the objects and all of their
nested objects recursivelly.

!!As a result, changes made to the objects referenced by the copied object will affect the original object and vice
versa.
!!As a result, changes made to the objects referenced by the copied object do not affect the original object, and vice
versa.