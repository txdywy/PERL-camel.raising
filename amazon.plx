#!/usr/bin/perl
use LWP::Simple;
print "Robot crawler!\n";
my $content=get "http://freshair.npr.org/dayFA.cfm?todayDate=current";
die "Couldn'tget $url" unless defined $content;
print $content,"\n";
