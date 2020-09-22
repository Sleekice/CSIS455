public class CompilationUnit implements Node{
    Node root;

    public CompilationUnit() {
        root = new AssignmentStatement();
    }

    @Override
    public void accept(StatementVisitor statementVisitor) {
        statementVisitor.visit(this);

    }
}
