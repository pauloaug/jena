/* Generated By:JavaCC: Do not edit this line. ShaclCompactParserJJConstants.java */
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.shacl.compact.reader.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ShaclCompactParserJJConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 47;
  /** RegularExpression Id. */
  int BOM = 48;
  /** RegularExpression Id. */
  int BASE = 49;
  /** RegularExpression Id. */
  int IMPORTS = 50;
  /** RegularExpression Id. */
  int PREFIX = 51;
  /** RegularExpression Id. */
  int SHAPE_CLASS = 52;
  /** RegularExpression Id. */
  int SHAPE = 53;
  /** RegularExpression Id. */
  int TRUE = 54;
  /** RegularExpression Id. */
  int FALSE = 55;
  /** RegularExpression Id. */
  int HEX = 56;
  /** RegularExpression Id. */
  int PLUS = 57;
  /** RegularExpression Id. */
  int MINUS = 58;
  /** RegularExpression Id. */
  int VBAR = 59;
  /** RegularExpression Id. */
  int AT = 60;
  /** RegularExpression Id. */
  int CARAT = 61;
  /** RegularExpression Id. */
  int DOT = 62;
  /** RegularExpression Id. */
  int BANG = 63;
  /** RegularExpression Id. */
  int QMARK = 64;
  /** RegularExpression Id. */
  int SLASH = 65;
  /** RegularExpression Id. */
  int STAR = 66;
  /** RegularExpression Id. */
  int EQUALS = 67;
  /** RegularExpression Id. */
  int LPAREN = 68;
  /** RegularExpression Id. */
  int RPAREN = 69;
  /** RegularExpression Id. */
  int LBRACE = 70;
  /** RegularExpression Id. */
  int RBRACE = 71;
  /** RegularExpression Id. */
  int LBRACKET = 72;
  /** RegularExpression Id. */
  int RBRACKET = 73;
  /** RegularExpression Id. */
  int UCHAR = 74;
  /** RegularExpression Id. */
  int IRIref = 75;
  /** RegularExpression Id. */
  int PNAME_NS = 76;
  /** RegularExpression Id. */
  int PNAME_LN = 77;
  /** RegularExpression Id. */
  int ATPNAME_NS = 78;
  /** RegularExpression Id. */
  int ATPNAME_LN = 79;
  /** RegularExpression Id. */
  int QUOTE_3D = 80;
  /** RegularExpression Id. */
  int QUOTE_3S = 81;
  /** RegularExpression Id. */
  int ECHAR = 82;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 83;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 84;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 85;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 86;
  /** RegularExpression Id. */
  int DIGITS = 87;
  /** RegularExpression Id. */
  int INTEGER = 88;
  /** RegularExpression Id. */
  int DECIMAL = 89;
  /** RegularExpression Id. */
  int DOUBLE = 90;
  /** RegularExpression Id. */
  int EXPONENT = 91;
  /** RegularExpression Id. */
  int LANGTAG = 92;
  /** RegularExpression Id. */
  int A2Z = 93;
  /** RegularExpression Id. */
  int A2ZN = 94;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 95;
  /** RegularExpression Id. */
  int PN_CHARS_U = 96;
  /** RegularExpression Id. */
  int PN_CHARS = 97;
  /** RegularExpression Id. */
  int PN_PREFIX = 98;
  /** RegularExpression Id. */
  int PN_LOCAL = 99;
  /** RegularExpression Id. */
  int VARNAME = 100;
  /** RegularExpression Id. */
  int PN_LOCAL_ESC = 101;
  /** RegularExpression Id. */
  int PLX = 102;
  /** RegularExpression Id. */
  int PERCENT = 103;
  /** RegularExpression Id. */
  int UNKNOWN = 104;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"->\"",
    "\"..\"",
    "\"BlankNode\"",
    "\"IRI\"",
    "\"Literal\"",
    "\"BlankNodeOrIRI\"",
    "\"BlankNodeOrLiteral\"",
    "\"IRIOrLiteral\"",
    "\"targetNode\"",
    "\"targetObjectsOf\"",
    "\"targetSubjectsOf\"",
    "\"targetClass\"",
    "\"deactivated\"",
    "\"severity\"",
    "\"message\"",
    "\"class\"",
    "\"datatype\"",
    "\"nodeKind\"",
    "\"minExclusive\"",
    "\"minInclusive\"",
    "\"maxExclusive\"",
    "\"maxInclusive\"",
    "\"minLength\"",
    "\"maxLength\"",
    "\"pattern\"",
    "\"flags\"",
    "\"languageIn\"",
    "\"equals\"",
    "\"disjoint\"",
    "\"closed\"",
    "\"ignoredProperties\"",
    "\"hasValue\"",
    "\"in\"",
    "\"uniqueLang\"",
    "\"lessThan\"",
    "\"lessThanOrEquals\"",
    "\"qualifiedValueShape\"",
    "\"qualifiedMinCount\"",
    "\"qualifiedMaxCount\"",
    "\"qualifiedValueShapesDisjoint\"",
    "\"^^\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "\"\\ufeff\"",
    "\"BASE\"",
    "\"IMPORTS\"",
    "\"PREFIX\"",
    "\"shapeClass\"",
    "\"shape\"",
    "\"true\"",
    "\"false\"",
    "<HEX>",
    "\"+\"",
    "\"-\"",
    "\"|\"",
    "\"@\"",
    "\"^\"",
    "\".\"",
    "\"!\"",
    "\"?\"",
    "\"/\"",
    "\"*\"",
    "\"=\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<UCHAR>",
    "<IRIref>",
    "<PNAME_NS>",
    "<PNAME_LN>",
    "<ATPNAME_NS>",
    "<ATPNAME_LN>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "<DIGITS>",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<EXPONENT>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "<PN_CHARS_BASE>",
    "<PN_CHARS_U>",
    "<PN_CHARS>",
    "<PN_PREFIX>",
    "<PN_LOCAL>",
    "<VARNAME>",
    "<PN_LOCAL_ESC>",
    "<PLX>",
    "<PERCENT>",
    "<UNKNOWN>",
  };

}
