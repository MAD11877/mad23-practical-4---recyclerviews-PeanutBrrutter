package sg.edu.np.mad.madpractical;

public class User {
    public String Name;
    public String Description;
    public int Id;
    public static boolean Followed;
    public User(String name, String description, int id, boolean followed) {
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }
}