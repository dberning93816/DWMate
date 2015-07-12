package dwtitle

class IssueFragmentController {
  IssueFragment part1, part2;

  def index() {
    part1 = IssueFragment.findAll("from IssueFragment as issueFragment where issueFragment.position = ? order by rand()", [1]).first()
    part2 = IssueFragment.findAll("from IssueFragment as issueFragment where issueFragment.position = ? order by rand()", [2]).first()

    render part1.content+' '+part2.content
  }
}
