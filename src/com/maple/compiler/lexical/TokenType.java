package com.maple.compiler.lexical;

enum TokenType {

    // linker
    Read,
    Page,

    // auxiliary
    BlockComment(true),
    LineComment(true),
    NewLine(true),
    WhiteSpace(true),
    Tab(true),

    // symbols and operators
    OpenBrace,
    CloseBrace,
    Semicolon,
    Colon,
    QuestionMark,
    Comma,
    OpenCurlyBrace,
    CloseCurlyBrace,
    OpenSquareBracket,
    CloseSquareBracket,

    Dot,
    Assign,
    AssignPlus,
    AssignMultiply,
    AssignMinus,
    AssignDivide,
    AssignReminder,
    Plus,
    Minus,
    Multiply,
    Divide,
    Reminder,
    Increment,
    Decrement,
    ShiftLeft,
    ShiftRight,
    And,
    Or,
    Not,
    Xor,

    CompareEqual,
    CompareNotEqual,
    LessThan,
    GreaterThan,
    LessThanEqual,
    GreaterThanEqual,

    BitwiseAnd,
    BitwiseOr,
    BitwiseNot,
    BitwiseXor,

    // literals
    IntBinaryLiteral,
    IntOctalLiteral,
    IntDecimalLiteral,
    IntHexadecimalLiteral,
    FloatDecimalLiteral,
    FloatHexadecimalLiteral,
    DoubleDecimalLiteral,
    DoubleHexadecimalLiteral,
    BooleanLiteral,
    StringLiteral,
    Null,

    // control flow
    If,
    Else,
    ElseIf,
    While,
    Do,
    For,
    Break,
    Continue,

    // access modifiers and qualifiers
    Global,
    Local,
    Shared,
    Static,
    Fuzzy,
    Constant,

    // functions
    Function,
    Returns,
    Return,
    Nothing,
    SameAs,
    Meta,

    // oop
    Class,
    Imaginary,
    Is,
    Implements,
    Interface,
    Collection,
    New,
    This,
    Parent,
    Typeof,

    // syntax and primitives types
    Int,
    Float,
    Double,
    String,
    Boolean,

    Identifier,

    // synchronization
    Atomic,

    // annotations
    Annotation,
    At,
    AppliesTo,
    Default,



    ;

    public final String typeName;
    public final boolean isAuxiliary;

    TokenType() {
        this.typeName = name();
        this.isAuxiliary = false;
    }

    TokenType(final boolean isAuxiliary) {
        this.typeName = this.name();
        this.isAuxiliary = isAuxiliary;
    }

}
