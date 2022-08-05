#Authors
- jcarey011 - jcare011@odu.edu
- Mtan006 - mtan006@odu.edu
- hhawa01 - hhawa001@odu.edu
- rmack1020 - rmack005@odu.edu
- rgwal001 - rgwal001@odu.edu
- jdlavinder - jlavi001@odu.edu


Reports Web Page: https://jcarey011.github.io/Website-Design-Analysis/

![image](https://user-images.githubusercontent.com/56100599/182976391-e7e2f7f2-a043-4c5f-85dc-634ee2af3983.png)



title Classes - Website Analysis

class WebsiteAnalyzer {

}

class Website {
	+Path localPath 
	+Collection siteURLs 
	+Collection allPages 
}

class DocParser {
	+Path localPath
	+Collection styles 
	+Collection scripts 
	+Collection links 
	+Collection images
}

class Stylesheet {

}

class Script {

}

class Image {

}

class Anchor { 
	+URL path 
	+Classification linkType 
	+TargetType destinationType
}

enum Classification { 
	+INTERNAL 
	+INTRAPAGE 
	+EXTERNAL 
}

enum TargetType { 
	+HTMLDOCUMENT 
	+ARCHIVE 
	+VIDEO 
	+AUDIO 
}

class ExcelWriter {

}

class JSONWriter {

}

class TextWriter {

}

class CommandLine { 
	+Input 
	+Output 
}
