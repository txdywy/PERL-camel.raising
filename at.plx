#!/usr/bin/perl
use LWP::UserAgent;
    my $ua  = LWP::UserAgent->new;
    my $response = $ua->get('https://us-amazon.icims.com/jobs/submittal');
    print $response->content, "\n";
