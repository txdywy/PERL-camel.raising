#!/usr/bin/perl
use LWP::Simple;
use HTML::HeadParser;
use HTML::FormatText::WithLinks;
use Encode qw/encode decode/;
print "Robot crawler!\n";
my$url='http://freshair.npr.org/dayFA.cfm?todayDate=current' 
my $content=get $url;
die "Couldn'tget $url" unless defined $content;
print $content;
