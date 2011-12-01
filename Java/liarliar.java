import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class liarliar {
  public static HashMap<String, HashSet<String>> people;
  public static HashMap<String, Boolean> visited;
  public static HashMap<String, Integer> colorGraph;

  public static void interpreter(Scanner sc){
    int num = sc.nextInt();

    for (int i = 0; i < num; i++){
      String key =  sc.next();

      if (!people.containsKey(key)){
        people.put(key, new HashSet<String>());
      }
      int limit = sc.nextInt();
      HashSet<String> children = new HashSet<String>();

      for (int j = 0 ; j < limit; j++){
        String s = sc.next();
        people.get(key).add(s);
        children.add(s);
      }

      for (String p : children){
        if (!people.containsKey(p)){
          people.put(p, new HashSet<String>());
        }
        people.get(p).add(key);

      }
    }

  }

  public static void main(String[] args) throws IOException {
    people = new HashMap<String, HashSet<String>>();
    visited = new HashMap<String, Boolean>();
    colorGraph = new HashMap<String, Integer>(); 

    Scanner sc = new Scanner(new File("new0.txt")); //System.getProperty("user.dir")+args[0]
    interpreter(sc);
    makeVisitedGraph(visited, people);
    getLiars(people);

    Iterator it = colorGraph.keySet().iterator();
    int ones = 0;
    while(it.hasNext()){
      if (colorGraph.get(it.next().toString()) == 1){
        ones++;
      }
    }
    int zeros = colorGraph.size() - ones;

    if (ones > zeros){
      System.out.println(ones + " " + zeros);
    }
    else {
      System.out.println(zeros + " " + ones);
    }

  }

  public static void makeVisitedGraph(
    HashMap<String, Boolean> visited,
    HashMap<String, HashSet<String>> people){

    Iterator it = people.keySet().iterator();
    while (it.hasNext()){
      visited.put(it.next().toString(), false);
    }
    /*
    Iterator r = visited.keySet().iterator();
    while(r.hasNext()){
      String key = r.next().toString();
      System.out.println( key + " " + visited.get(key));
    }
     */
  }
  public static void getLiars(
    HashMap<String, HashSet<String>> people){

    Queue<String> queue = new LinkedList<String>();
    Iterator it = people.keySet().iterator();
    String key = it.next().toString();

    visited.put(key, true);
    queue.add(key);
    int color = 1;
    colorGraph.put(key, color);

    while(!queue.isEmpty()){
      String y = queue.remove();
      color = 1 - colorGraph.get(y);
      for (String z : people.get(y)){

        if (!visited.get(z)){
          visited.put(z, true);
          colorGraph.put(z, color);
          queue.add(z);
        }
      }

    }

  }

  public static void printHashMap(HashMap<String,
                                  HashSet<String>> people){
    Iterator it = people.keySet().iterator();
    while(it.hasNext()){
      String key = it.next().toString();
      System.out.println("The key: "+ key);
      for (String s : people.get(key)){
        System.out.println(s);
      }
    }
  }

  public static void printMap(HashSet<String> map){
    for(String s: map){
      System.out.println(s);
    }
  }
}