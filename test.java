public class test {
    public static void main (String[] args){

        Network network = new Network();

        User Rafie = network.addUser("Rafie");
        User Zaidan = network.addUser("Zaidan");

        Rafie.addPost("Hello, this is Rafie's first post!");
        Zaidan.addPost("Hi everyone, Zaidan here!");

        network.addPost(Rafie.getPosts().get(0));
        network.addPost(Zaidan.getPosts().get(0));

        Rafie.likePost(Rafie.getPosts().get(0));
        Zaidan.likePost(Zaidan.getPosts().get(0));

        network.showAllPosts();
    }
} 
