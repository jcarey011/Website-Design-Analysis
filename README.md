![image](https://user-images.githubusercontent.com/87342389/177408810-6d8f3c00-40d0-442e-ae14-704d6546fc6c.png)



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

![image](https://user-images.githubusercontent.com/92636394/177410905-fc86e3c9-745c-476b-9207-bca843961b0f.png)
