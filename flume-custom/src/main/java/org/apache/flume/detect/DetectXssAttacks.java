package org.apache.flume.detect;

public class DetectXssAttacks implements DetectAttacks{
	private String[] XssAttackRegex = {
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i)(<script[^>]*>[\\s\\S]*?<\\/script[^>]*>|<script[^>]*>[\\s\\S]*?<\\/script[[\\s\\S]]*[\\s\\S]|<script[^>]*>[\\s\\S]*?<\\/script[\\s]*[\\s]|"
			+ "<script[^>]*>[\\s\\S]*?<\\/script|<script[^>]*>[\\s\\S]*?)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i)((?:=|U\\s*R\\s*L\\s*\\()\\s*[^>]*\\s*S\\s*C\\s*R\\s*I\\s*P\\s*T\\s*:|&colon;|[\\s\\S]allowscriptaccess[\\s\\S]|[\\s\\S]src[\\s\\S]|"
			+ "[\\s\\S]data:text\\/html[\\s\\S]|[\\s\\S]xlink:href[\\s\\S]|[\\s\\S]base64[\\s\\S]|[\\s\\S]xmlns[\\s\\S]|[\\s\\S]xhtml[\\s\\S]|[\\s\\S]style[\\s\\S]|"
			+ "<style[^>]*>[\\s\\S]*?|[\\s\\S]@import[\\s\\S]|<applet[^>]*>[\\s\\S]*?|<meta[^>]*>[\\s\\S]*?|<object[^>]*>[\\s\\S]*?)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"<(a|abbr|acronym|address|applet|area|audioscope|b|base|basefront|bdo|bgsound|big|blackface|blink|blockquote|body|bq|br|button|caption|center|cite|"
			+ "code|col|colgroup|comment|dd|del|dfn|dir|div|dl|dt|em|embed|fieldset|fn|font|form|frame|frameset|h1|head|hr|html|i|iframe|ilayer|img|input|ins|"
			+ "isindex|kdb|keygen|label|layer|legend|li|limittext|link|listing|map|marquee|menu|meta|multicol|nobr|noembed|noframes|noscript|nosmartquotes|object|"
			+ "ol|optgroup|option|p|param|plaintext|pre|q|rt|ruby|s|samp|script|select|server|shadow|sidebar|small|spacer|span|strike|strong|style|sub|sup|table|"
			+ "tbody|td|textarea|tfoot|th|thead|title|tr|tt|u|ul|var|wbr|xml|xmp)\\W",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\bon(abort|blur|change|click|dblclick|dragdrop|error|focus|keydown|keypress|keyup|load|mousedown|mousemove|mouseout|mouseover|mouseup|move|"
			+ "readystatechange|reset|resize|select|submit|unload)\\b\\W*?=",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\b(src|url|href|lowsrc)\\b\\W*?\\b(http|shell):",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\b(background|dynsrc|href|lowsrc|src)\\b\\W*?=",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"<body\\b.*?\\b(onload|background)\\b",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\b(src|url|href|lowsrc)\\b\\W*?\\b(javascript|vbscript):",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\.(execscript|addimport|innerhtml|fromcharcode)\\b",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\< ?(script|meta)\\b",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\btype\\b\\W*?\\b(application|text)\\b\\W*?\\b(vbscript|javascript|x-javascript|jscript|x-vbscript|ecmascript)\\b",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\bdocument\\b\\s*\\.\\s*\\bcookie\\b",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"[/'\"<]xss[/'\">]",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"<xss>=&{()}",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\bstyle\\b\\W*\\=.*bexpression\\b\\W*\\(",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\balert\\b\\W*?\\(",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(asfunction|javascript|vbscript|data|mocha|livescript):",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<script.*?[ /+\t]*?((src)|(xlink:href)|(href))[ /+\t]*=)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<[i]?frame.*?[ /+\\t]*?src[ /+\\t]*=)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<.*[:]vmlframe.*?[ /+\\t]*?src[ /+\\t]*=)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"background\\b\\W*?:\\W*?url|background-image\\b\\W*?:|behavior\\b\\W*?:\\W*?url|-moz-binding\\b|@import\\b|expression\\b\\W*?\\(",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\@import\\",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\bbackground-image:",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(fromcharcode|alert|eval)\\s*\\(",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(88,83,83)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\< ?iframe",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\biframe\\b.{0,100}?\\bsrc\\b",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<form.*?>)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"\\bactivexobject\\b",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<META[ /+\\t].*?charset[ /+\\t]*=)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<LINK[ /+\\t].*?href[ /+\\t]*=)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<BASE[ /+\\t].*?href[ /+\\t]*=)",
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			"(?i:<EMBED[ /+\\t].*?((src)|(type)).*?=)"
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	};
	@Override
	public void Detect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAttackAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAttackRegex() {
		// TODO Auto-generated method stub
		return null;
	}

}
