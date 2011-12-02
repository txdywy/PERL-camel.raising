use warnings;
#use strict;
print "Hello, world.\n", "good", " time", "yes\n", "no\n";
print 2232,"+",03+9/7,"=",2==2,"?\n";
print "ff ",6>3 and 3>4,"\n";
print "\nx"x3,"\n";
$name="wei";
print $name, "\n";
#my $yen=<STDIN>;
#print 30_3/$yen, "\n";

print "那些年，我们一起追的女孩\n";

my @array=(10,20,30);
print scalar @array, "\n";


for $element (reverse(@array)) {
	print $element=$element*2,@array ,"\n"
}

unshift @array, 300; 

print "@array","\n";
my @sorted=sort @array;
print "@sorted","\n";

@sorted=sort {$a cmp $b} @array;
print "@sorted","\n";

@sorted=sort {$a <=> $b} @array;
print "@sorted","\n";

my $place="Fitchburg";
my %where=(
	Yi	=>	"Fitchburg",
	GG	=>	"Madison",
	BB	=>	"Beijing"
);

my %who=reverse %where;
print %where,"\n";
print %who,"\n";
print "$where{'Yi'} in $place","\n";
print "$who{$place} in $place","\n";
delete $where{'Yi'};
print %where,"\n";

for (keys %where){
	print $_,",",$where{$_},"\n";
}

if (not exists $where{'BB'}){
	die "nothing \n";
} 

if ( (()) ){
	print "(())true\n";
}
else{
	print "(())false\n";
}

my $choice=10;
for (1,7,9,0) {
	print $_,"\n";
	#$_ == 6 && print "six\n";
	#$_ == 7 && print "six\n";
	last if $_ == 9;
}

my $found=0;
$_="dsds ds  we  g r  t g  tg ppld t gt  tgt gg t dppl";
my $sought="ppl";
foreach my $word(split){
		$found+=1;
        if($word eq $sought){
                
                last;
        }
}
#if($found){
        print "ppl found $found\n";
#}

$_="dsds ds  we  g r  t g  tg ppld t gt  tgt gg t dppl";
if($_!~/uuppl/){
	print "ppl found $found\n";
}




























print "\n";
