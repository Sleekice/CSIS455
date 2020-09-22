public class VisitorStatementDemo {
    public static void main(String[] args){
        Node prac = new CompilationUnit();
        prac.accept(new AssignmentStatementVisitor());
    }

}
