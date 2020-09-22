public class IdentifierNode implements Node {
    private char id;
    public IdentifierNode(char temp_val){
        this.id = temp_val;
    }

    public char getID() {
        return this.id;
    }

    @Override
    public void accept(StatementVisitor statementVisitor){
        statementVisitor.visit(this);
    }
}
