package dwtitle

class IssueFragment {
  int position;
  String content;

  static constraints = {
    position(nullable: false)
    content(blank: false)
  }}
