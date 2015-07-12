package dwtitle

import grails.converters.JSON

class TitleFragmentController {
    TitleFragment part1, part2, part3;

    def index() {
      part1 = TitleFragment.findAll("from TitleFragment as titleFragment where titleFragment.position = ? order by rand()", [1]).first()
      part2 = TitleFragment.findAll("from TitleFragment as titleFragment where titleFragment.position = ? order by rand()", [2]).first()
      part3 = TitleFragment.findAll("from TitleFragment as titleFragment where titleFragment.position = ? order by rand()", [3]).first()

      render part1.content+' '+part2.content+' '+part3.content
    }

    def show(params) { }
}
