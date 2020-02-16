package com.maple.compiler.lexical;

import com.maple.compiler.utils.RegExUtils;

import java.util.ArrayList;
import java.util.List;

// contains all the valid tokens for the GameCode language specification
public enum MapleValidTokens {

    // linker
    Read(TokenType.Read, "\\b(read)\\b.*"),
    Page(TokenType.Page, "\\b(page)\\b.*"),

        // auxiliary
    BlockComment(TokenType.BlockComment, "(/\\*.*?\\*/).*"),
    LineComment(TokenType.LineComment, "(//(.*?)[\r$]?\n).*"),
    NewLine(TokenType.NewLine, "(\\n).*"),
    WhiteSpace(TokenType.WhiteSpace, "( ).*"),
    Tab(TokenType.Tab, "(\\t).*"),

    // general
    Semicolon(TokenType.Semicolon, "(;).*"),
    Comma(TokenType.Comma, "(,).*"),
    Dot(TokenType.Dot, "(\\.).*"),
    Colon(TokenType.Colon, "(:).*"),
    QuestionMark(TokenType.QuestionMark, "(\\?).*"),
        // symbols and operators
        // Brackets
    OpenBrace(TokenType.OpenBrace, "(\\().*"),
    CloseBrace(TokenType.CloseBrace, "(\\)).*"),
    OpenCurlyBrace(TokenType.OpenCurlyBrace, "(\\{).*"),
    CloseCurlyBrace(TokenType.CloseCurlyBrace, "(\\}).*"),
    OpenSquareBracket(TokenType.OpenSquareBracket, "(\\[).*"),
    CloseSquareBracket(TokenType.CloseSquareBracket, "(\\]).*"),
        // logical operators
    And(TokenType.And, "\\b(and)\\b.*"),
    Or(TokenType.Or, "\\b(or)\\b.*"),
    Not(TokenType.Not, "\\b(not)\\b.*"),
    Xor(TokenType.Xor, "\\b(xor)\\b.*"),
        // bitwise operators
    ShiftLeft(TokenType.ShiftLeft, "(\\<\\<).*"),
    ShiftRight(TokenType.ShiftRight, "(\\>\\>).*"),
    BitwiseAnd(TokenType.BitwiseAnd, "(\\&).*"),
    BitwiseOr(TokenType.BitwiseOr, "(\\|).*"),
    BitwiseNot(TokenType.BitwiseNot, "(\\!).*"),
    BitwiseXor(TokenType.BitwiseXor, "(\\~).*"),
        // arithmetic
    Plus(TokenType.Plus, "(\\+{1}).*"),
    Minus(TokenType.Minus, "(\\-{1}).*"),
    Multiply(TokenType.Multiply, "(\\*).*"),
    Divide(TokenType.Divide, "(/).*"),
    Reminder(TokenType.Reminder, "(\\%).*"),
    Increment(TokenType.Increment, "(\\+\\+).*"),
    Decrement(TokenType.Decrement, "(\\-\\-).*"),
        // assignments
    Assign(TokenType.Assign, "(=).*"),
    AssignPlus(TokenType.AssignPlus, "(\\+\\=).*"),
    AssignMinus(TokenType.AssignMinus, "(\\-\\=).*"),
    AssignMultiply(TokenType.AssignMultiply, "(\\*\\=).*"),
    AssignDivide(TokenType.AssignDivide, "(\\/\\=).*"),
    AssignReminder(TokenType.AssignReminder, "(\\%\\=).*"),
        // comparisons
    CompareEqual(TokenType.CompareEqual, "(==).*"),
    CompareNotEqual(TokenType.CompareNotEqual, "(\\!=).*"),
    GreaterThan(TokenType.GreaterThan, "(>).*"),
    LessThan(TokenType.LessThan, "(<).*"),
    GreaterThanEqual(TokenType.GreaterThanEqual, "(>=).*"),
    LessThanEqual(TokenType.LessThanEqual, "(<=).*"),

    // functions
    Function(TokenType.Function, "\\b(function)\\b.*"),
    Returns(TokenType.Returns, "\\b(returns)\\b.*"),
    Return(TokenType.Return, "\\b(return)\\b.*"),
    Nothing(TokenType.Nothing, "\\b(nothing)\\b.*"),
    SameAs(TokenType.SameAs, "\\b(same[\\s]+as).*"),
    Meta(TokenType.Meta, "\\b(meta)\\b.*"),
        // control flow
    If(TokenType.If, "\\b(if)\\b.*"),
    Else(TokenType.Else, "\\b(else)\\b.*"),
    ElseIf(TokenType.ElseIf, "\\b(else\\s+if).*"),
    For(TokenType.For, "\\b(for)\\b.*"),
    While(TokenType.While, "\\b(while)\\b.*"),
    Do(TokenType.Do, "\\b(do)\\b.*"),
    Break(TokenType.Break, "\\b(break)\\b.*"),
    Continue(TokenType.Continue, "\\b(continue)\\b.*"),
    // access modifiers and qualifiers
    Global(TokenType.Global, "\\b(global)\\b.*"),
    Local(TokenType.Local, "\\b(local)\\b.*"),
    Shared(TokenType.Shared, "\\b(shared)\\b.*"),
    Static(TokenType.Static, "\\b(static)\\b.*"),
    Constant(TokenType.Constant, "\\b(constant)\\b.*"),
    Fuzzy(TokenType.Fuzzy, "\\b(fuzzy)\\b.*"),
        // literals and building blocks (primitives)
    Int(TokenType.Int, "\\b(int)\\b.*"),
    Float(TokenType.Float, "\\b(float)\\b.*"),
    String(TokenType.String, "\\b(string)\\b.*"),
    Boolean(TokenType.Boolean, "\\b(boolean)\\b.*"),

    // classes
    Class(TokenType.Class, "\\b(class)\\b.*"),
    Interface(TokenType.Interface, "\\b(interface)\\b.*"),
    Collection(TokenType.Collection, "\\b(collection)\\b.*"),
    Imaginary(TokenType.Imaginary, "\\b(imaginary)\\b.*"),
    Is(TokenType.Is, "\\b(is)\\b.*"),
    Implements(TokenType.Implements, "\\b(implements)\\b.*"),
    New(TokenType.New, "\\b(new)\\b.*"),
    This(TokenType.This, "\\b(this)\\b.*"),
    Parent(TokenType.Parent, "\\b(this)\\b.*"),
    Typeof(TokenType.Typeof, "\\b(typeof)\\b.*"),

    // annotations
    Annotation(TokenType.Annotation, "\\b(annotation)\\b.*"),
    At(TokenType.Annotation, "(\\@).*"),
    AppliesTo(TokenType.AppliesTo, "\\b(same[\\s]+as)\\b.*"),
    Default(TokenType.Default, "\\b(default)\\b.*"),

    // synchronization
    Atomic(TokenType.Atomic, "\\b(atomic)\\b.*"),

    // literals and identifiers
    Identifier(TokenType.Identifier, "\\b([a-zA-Z]{1}[0-9a-zA-Z_]*)\\b.*"), // can't start with _ or 0-9, must contains at least 1 letter.
    BooleanLiteral(TokenType.BooleanLiteral, "\\b(true|false)\\b.*"),
    StringLiteral(TokenType.StringLiteral, "(\"((\\\\.)|(\\\\\")|([^\"\\\\]))*\").*"), // needs more testing
    FloatDecimalLiteral(TokenType.FloatDecimalLiteral, "\\b([+-]?[0-9]+\\.[0-9]+)\\b.*"), //[-+]?[0-9]+\.[0-9]+
    FloatHexadecimalLiteral(TokenType.FloatHexadecimalLiteral, "\\b([0-9a-fA-F]*\\.[0-9a-fA-F]+)\\b.*"),
    IntBinaryLiteral(TokenType.IntBinaryLiteral, "\\b([+-]?(0b|0B)[01]+)\b.*"),
    IntOctalLiteral(TokenType.IntOctalLiteral, "\\b([+-]?(0c|0C)[0-7]+)\\b.+"),
    IntDecimalLiteral(TokenType.IntDecimalLiteral, "\\b([+-]?[0-9]+)\\b.*"),
    IntHexadecimalLiteral(TokenType.IntHexadecimalLiteral, "\\b([+-]?(0x|0X)[0-9a-fA-F]+)\\b.*"),
    Null(TokenType.Null, "\\b(null)\\b.*"),

    // exception handling?

    ;

    public final TokenType tokenType;
    public final String regex;

    MapleValidTokens(TokenType type, String regex) {
        this.tokenType = type;
        this.regex = regex;
    }

    MapleValidTokens(TokenType type, String ...regExpressions) {
        this.tokenType = type;
        List<String> regularExpressions = new ArrayList<>();
        for (String regEx : regExpressions) {
            regularExpressions.add(regEx);
        }
        regex = RegExUtils.getCompoundRegex(regularExpressions);
    }

}

