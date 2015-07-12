import dwtitle.TitleFragment
import dwtitle.IssueFragment

class BootStrap {

    def init = { servletContext ->

      // Init titles
      String titles = this.class.classLoader.getResourceAsStream('data/titles.txt').text
      String[] entries

      titles.eachLine { line ->
        if(line.trim().size() > 0) {
          entries = line.split(', ')
          new TitleFragment(position: entries[0], content: entries[1]).save()
        }
      }

      // Init issues
      String issues = this.class.classLoader.getResourceAsStream('data/issues.txt').text

      issues.eachLine { line ->
        if(line.trim().size() > 0) {
          entries = line.split(', ')
          new IssueFragment(position: entries[0], content: entries[1]).save()
        }
      }
    }
    def destroy = {
    }
}
