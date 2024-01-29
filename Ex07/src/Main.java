
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Entities> list = new ArrayList<>();

        System.out.print("How many employees will be rented?");
        int employees = sc.nextInt();

        for(int i = 0; i<employees; i++){
            System.out.print("\n");
            System.out.print("Employee #"+(i+1)+":\n");
            System.out.print("ID: ");
            int a  = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Entities(a, name, salary ));
        }

        System.out.print("Enter the employee id that will have salary incrase: ");
        int id = sc.nextInt();
        Entities ent = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(ent == null) {
            System.out.print("ID not found");
            return;
        }
        System.out.print("Enter  the percentage: ");
        double percent = sc.nextDouble();
        ent.IncrementPercentage(percent);

        System.out.print("List of Employees:\n");
        for(Entities obj : list){
            System.out.print(obj);
        }
    }
}

/*Criação de listas:
  • Tamanho da lista: size()
  • Obter o elemento de uma posição: get(position)
  • Inserir elemento na lista: add(obj), add(int, obj)
  • Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
  • Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
  • Filtrar lista com base em predicado:
     List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
  • Encontrar primeira ocorrência com base em predicado:
      Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
 */