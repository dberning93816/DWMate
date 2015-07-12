package dwtitle

import grails.rest.*

//@Resource(uri='/dwtitle', formats=['json', 'xml'])
class TitleFragment {
    int position;
    String content;

    static constraints = {
      position(nullable: false)
      content(blank: false)
    }
}
