#!/usr/bin/perl
#rhyming.plx
use warnings;
use strict;
@ARGV = ("wordlist.txt");
my $syllable = "ink";
my $syllable1 = "b";
while (<>){
	#print if /$syllable$/;
	print if /^$syllable1$/;
}
