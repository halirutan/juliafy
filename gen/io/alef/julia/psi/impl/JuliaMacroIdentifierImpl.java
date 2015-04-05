// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaIdentifier;
import io.alef.julia.psi.JuliaMacroIdentifier;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaMacroIdentifierImpl extends JuliaExpressionImpl implements JuliaMacroIdentifier {

    public JuliaMacroIdentifierImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitMacroIdentifier(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public JuliaIdentifier getIdentifier() {
        return findChildByClass(JuliaIdentifier.class);
    }

}