public interface StatementVisitor {
     void visit(CompilationUnit compilationUnit);
     void visit(AdditionExpression addExp);
     void visit(SubtractionExpression subExp);
     void visit(IdentifierNode theNode);
     void visit(AssignmentStatement assignStatement);

}
