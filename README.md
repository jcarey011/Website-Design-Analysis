![image](https://user-images.githubusercontent.com/92636394/177412566-29f551d7-f3da-4100-a93e-0675652bccc5.png)


title Classes - Website Analysis


class Website {
  Path localPath
  Collection<URL> siteURLs
  Collection<HTMLDocument> allPages
}

Class HTMLDocument {
  Path localPath
  Collection<StyleSheet> styles
  Collection<JavaScript> scripts
  Collection<Anchor> links
  Collection<Image> images
  
}

class Stylesheet {

}

class Script {

}

class Image {

}

class Anchor {
    URI path
    Classification linkType
    TargetType destinationType
}

enum Classification {
    INTERNAL
    INTRAPAGE
    EXTERNAL
}

enum TargetType {
    HTMLDOCUMENT
    ARCHIVE
    VIDEO
    AUDIO
}

class ExcelWriter {

}

class JSONWriter {

}

class TextWriter {

}

class CLI {
  Input
  Output
}
