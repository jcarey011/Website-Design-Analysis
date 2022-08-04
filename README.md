#Authors
- jcarey011 - jcare011@odu.edu
- Mtan006 - mtan006@odu.edu
- hhawa01 - hhawa001@odu.edu
- rmack1020 - rmack005@odu.edu
- rgwal001 - rgwal001@odu.edu
- jdlavinder - jlavi001@odu.edu


Reports Web Page: https://jcarey011.github.io/Website-Design-Analysis/

![PlantText](https://user-images.githubusercontent.com/87342389/177419031-2d06507d-31a4-4e3f-8af3-a195c8c29040.png)



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

class CommandLineInterface {
  Input
  Output
}