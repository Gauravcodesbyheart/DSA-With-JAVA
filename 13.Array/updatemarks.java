public class updatemarks {
    public static void updatemarksofarray(int marks[]){
        for (int i=0;i<=marks.length-1;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main (String args[]){
        int marks[] = {67,87,89,95};
        updatemarksofarray(marks);
        for (int i=0;i<=marks.length-1;i++){
            System.out.println(marks[i]+"");
        }
        System.out.println();
        
    }
    
}
