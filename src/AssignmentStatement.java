public class AssignmentStatement implements Node {
    IdentifierNode a = new IdentifierNode('a');
    AdditionExpression b = new AdditionExpression();

    @Override
    public void accept(StatementVisitor statementVisitor){
        statementVisitor.visit(this);
    }

}
