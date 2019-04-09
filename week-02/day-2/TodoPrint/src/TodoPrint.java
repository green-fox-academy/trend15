public class TodoPrint {
    public static void main(String[] args) {
        String todoTextStart = " My todo:\n";
        String todoText = " - Buy milk\n";
        String todoText2 = " - Download games\n";
        String spaces = "    ";
        String todoSubText2 = " - Diablo";
        todoText = todoText.concat(todoText2).concat(spaces).concat(todoSubText2);
        String separatedurl = todoText.substring(0);
        todoText = todoTextStart + todoText;
        System.out.println(todoText);
    }
}
